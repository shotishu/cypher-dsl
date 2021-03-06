/**
 * Copyright (c) 2002-2013 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.cypherdsl.expression;

/**
 * Expression that evaluates to a number
 */
public interface NumericExpression
        extends ScalarExpression
{
    public NumericExpression add( Number expression );

    public NumericExpression add( NumericExpression expression );

    public NumericExpression subtract( Number expression );

    public NumericExpression subtract( NumericExpression expression );

    public NumericExpression times( Number expression );

    public NumericExpression times( NumericExpression expression );

    public NumericExpression divideBy( Number expression );

    public NumericExpression divideBy( NumericExpression expression );

    public NumericExpression mod( Number expression );

    public NumericExpression mod( NumericExpression expression );

    public BooleanExpression gt( Number expression );

    public BooleanExpression gt( NumericExpression expression );

    public BooleanExpression lt( Number expression );

    public BooleanExpression lt( NumericExpression expression );

    public BooleanExpression gte( Number expression );

    public BooleanExpression gte( NumericExpression expression );

    public BooleanExpression lte( Number expression );

    public BooleanExpression lte( NumericExpression expression );
}
