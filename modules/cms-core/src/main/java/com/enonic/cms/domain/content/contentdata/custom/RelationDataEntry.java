/*
 * Copyright 2000-2011 Enonic AS
 * http://www.enonic.com/license
 */
package com.enonic.cms.domain.content.contentdata.custom;

import com.enonic.cms.domain.content.ContentKey;

public interface RelationDataEntry
    extends InputDataEntry
{
    public ContentKey getContentKey();
}
