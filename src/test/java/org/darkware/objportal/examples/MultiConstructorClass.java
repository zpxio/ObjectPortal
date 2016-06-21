/*
 * Copyright (c) 2016. darkware.org and contributors
 *
 * This program is free software: you can redistribute it and/or modify
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

package org.darkware.objportal.examples;

import javax.inject.Inject;
import java.nio.file.Path;

/**
 * A class with multiple constructors marked for injection
 *
 * @author jeff@darkware.org
 * @since 2016-06-21
 */
public class MultiConstructorClass
{
    @Inject
    public Integer count;
    public final Path file;

    @Inject
    public MultiConstructorClass(final Path file)
    {
        super();

        this.file = file;
    }

    @Inject
    public MultiConstructorClass(final Path file, final Integer count)
    {
        super();

        this.file = file;
        this.count = count;
    }
}