package models

import java.util.Date

case class Employee(
                   // person.ID: long
                   // employer.ID: long
                   id: Long,
                   originalHireDate: Date,
                   lastTerminatedDate: Date,
                   employmentType: String,
                   employmentSchedule: String,
                   payrollNumber: String,
                   job: String,
                   grade: String,
                   location: String,
                   payCenter: String,
                 )

object Employee {
//  implicit val employeeFormat = Json.format[Employee]
}
