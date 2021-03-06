/*
 * Copyright 2000-2011 Enonic AS
 * http://www.enonic.com/license
 */
package com.enonic.cms.business.core.security;

import org.springframework.beans.factory.annotation.Autowired;

import com.enonic.cms.store.dao.UserStoreDao;

import com.enonic.cms.domain.security.userstore.UserStoreEntity;
import com.enonic.cms.domain.security.userstore.UserStoreKey;
import com.enonic.cms.domain.security.userstore.UserStoreNotFoundException;

public class UserStoreParser
{

    @Autowired
    private UserStoreDao userStoreDao;

    public UserStoreEntity parseUserStore( String string )
        throws UserStoreNotFoundException
    {

        if ( string == null )
        {
            return null;
        }

        UserStoreEntity userStore;

        if ( string.startsWith( "#" ) )
        {
            UserStoreKey userStoreKey = new UserStoreKey( string );
            userStore = userStoreDao.findByKey( userStoreKey );
            if ( userStore == null )
            {
                throw new UserStoreNotFoundException( userStoreKey );
            }
        }
        else
        {

            Integer userStoreKeyInteger;
            try
            {
                userStoreKeyInteger = new Integer( string );
                userStore = userStoreDao.findByKey( new UserStoreKey( userStoreKeyInteger ) );
            }
            catch ( NumberFormatException e )
            {
                userStore = userStoreDao.findByName( string );
            }

            if ( userStore == null )
            {
                throw new UserStoreNotFoundException( string );
            }
        }

        return userStore;
    }

}
