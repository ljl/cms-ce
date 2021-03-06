/*
 * Copyright 2000-2011 Enonic AS
 * http://www.enonic.com/license
 */
package com.enonic.cms.domain.content.index.queryexpression;

import com.enonic.cms.domain.content.index.util.QueryFunctions;

public class FunctionEvaluator
    extends QueryEvaluatorAdapter
{
    public Object evaluate( FunctionExpr expr )
    {
        return QueryFunctions.executeFunction( expr );
    }
}
