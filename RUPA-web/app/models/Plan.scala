package models

import java.util.Date

case class Plan(
                   id: Long,
                   taxIdNumber: String,
                   planCode: String,
                   name: String,
                   shortName: String,
                   planAnniversaryDay: Integer,
                   planAnniversaryMonth: Integer,
                   dateEstablished: Date,
                   planStatus: String,
                   planStatusDate:  Date
                 )

// TODO:  Add Form 5500 data fields

object Plan {
//  implicit val planFormat = Json.format[Plan]
}
