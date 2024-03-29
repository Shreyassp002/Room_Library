package com.rey.room_liabrary

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update


@Dao
interface EmployeeDao {

    @Insert
    suspend fun insert(employeeEntity: EmployeeEntity)

    @Update
    suspend fun update(employeeEntity: EmployeeEntity)

    @Delete
    suspend fun delete(employeeEntity: EmployeeEntity)

    @Query("SELECT * FROM `employee-table`")
    fun fetchAllEmployees():kotlinx.coroutines.flow.Flow<List<EmployeeEntity>>

    @Query("SELECT * FROM `employee-table` where id =:id")
    fun fetchEmployeeId(id: Int):kotlinx.coroutines.flow.Flow<EmployeeEntity>
}