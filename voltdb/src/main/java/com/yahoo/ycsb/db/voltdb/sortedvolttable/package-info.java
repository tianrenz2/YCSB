/**
 * Copyright (c) 2015-2019 YCSB contributors. All rights reserved.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you
 * may not use this file except in compliance with the License. You
 * may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License. See accompanying
 * LICENSE file.
 */ 
/**
 * 
 * VoltDBTableSortedMergeWrangler allows you to merge an array of VoltTable
 * provided by callAllPartitionProcedure.
 * 
 * The intended use case is for when you need to issue a multi partition query
 * but would prefer not to, as you don't need perfect read consistency and would
 * rather get the individual VoltDB partitions to issue the query independently
 * and then somehow merge the results.
 *
 */
package com.yahoo.ycsb.db.voltdb.sortedvolttable;
