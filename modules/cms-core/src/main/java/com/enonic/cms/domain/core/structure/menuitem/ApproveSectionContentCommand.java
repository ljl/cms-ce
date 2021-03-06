/*
 * Copyright 2000-2011 Enonic AS
 * http://www.enonic.com/license
 */
package com.enonic.cms.domain.core.structure.menuitem;

import java.util.ArrayList;
import java.util.List;

import com.enonic.cms.domain.content.ContentKey;
import com.enonic.cms.domain.security.user.UserKey;
import com.enonic.cms.domain.structure.menuitem.MenuItemKey;

public class ApproveSectionContentCommand
{
    private UserKey user;

    private MenuItemKey sectionKey;

    private List<ContentKey> approvedContentToUpdate = new ArrayList<ContentKey>();

    public UserKey getUpdater()
    {
        return user;
    }

    public void setUpdater( UserKey user )
    {
        this.user = user;
    }

    public MenuItemKey getSection()
    {
        return sectionKey;
    }

    public void setSection( MenuItemKey sectionKey )
    {
        this.sectionKey = sectionKey;
    }

    public List<ContentKey> getApprovedContentToUpdate()
    {
        return approvedContentToUpdate;
    }

    public void addApprovedContentToUpdate( ContentKey key )
    {
        approvedContentToUpdate.add( key );
    }
}
