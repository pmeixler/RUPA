package models

import java.util.Date

case class ParticipantHour(
                   // employee.ID: long,
                   id: Long,
                   periodStartDate: Date,
                   periodEndDate: Date,
                   hour1: String,
                   hour2: String,
                   hour3: String,
                   service1: String,
                   service2: String,
                   service3: String
                 )

object ParticipantHour {
//  implicit val participantHoursFormat = Json.format[ParticipantHours]
}
