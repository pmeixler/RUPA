package models

import java.util.Date

case class ParticipantEarning(
                   // employee.ID: long,
                   id: Long,
                   periodStartDate: Date,
                   periodEndDate: Date,
                   earning1: String,
                   earning2: String,
                   earning3: String,
                   earning4: String,
                   earning5: String,
                   earning6: String
                 )

object ParticipantEarning {
//  implicit val participantEarningsFormat = Json.format[ParticipantEarnings]
}
