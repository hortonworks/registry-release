/**
 * Copyright 2016-2019 Cloudera, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 **/
package com.hortonworks.registries.storage.impl.jdbc.provider.sql.query;

import com.hortonworks.registries.common.Schema;
import com.hortonworks.registries.storage.PrimaryKey;

import java.sql.PreparedStatement;
import java.util.List;

public interface SqlQuery {

    /**
     * @return The list of columns that constitute this database table
     */
    List<Schema.Field> getColumns();

    /**
     * @return table name or namespace
     *
     */
    String getNamespace();

    /**
     * @return The {@link PrimaryKey} used in the query construction process <br>
     * null if no {@link PrimaryKey} used
     */
    PrimaryKey getPrimaryKey();

    /**
     * @return The SQL query with the place parameters ready to be replaced in a {@link PreparedStatement}
     */
    String getParametrizedSql();
}
