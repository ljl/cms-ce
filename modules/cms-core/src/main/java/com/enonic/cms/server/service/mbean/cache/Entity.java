/*
 * Copyright 2000-2011 Enonic AS
 * http://www.enonic.com/license
 */
package com.enonic.cms.server.service.mbean.cache;

public class Entity
    extends AbstractCache
    implements EntityMBean
{
    public Entity()
    {
        super( "entity" );
    }
}
