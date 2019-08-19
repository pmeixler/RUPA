package models

import java.util.Date

case class EmployeeStatus(
                   // employee.ID: long,
                   id: Long,
                   periodStartDate: Date,
                   periodEndDate: Date,
                   status1: String,
                   status2: String,
                   status3: String,
                   statusDate1: Date,
                   statusDate2: Date,
                   statusDate3: Date,
                 )

object EmployeeStatus {
//  implicit val employeeStatusFormat = Json.format[EmployeeStatus]
}
