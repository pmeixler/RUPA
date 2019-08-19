package models

import java.util.Date

case class Participant(
                   // person.ID: long
                   // plan.ID: long
                   id: Long,
                   priorPlanParticipation: Boolean,
                   priorPlanParticipationEffDate: Date,
                   eligibilityStartDate: Date,
                   dateOfParticipation: Date,
                   vestingServiceStartDate: Date,
                   firstVestedDate: Date,
                   oneHundredPercentVestedDate: Date,
                   deathBenefitEligibilityDate: Date,
                   disabilityEligibilityDate: Date,
                   earliestRetirementDate: Date,
                   unreducedEarlyRetirementDate: Date,
                   normalRetirementDate: Date,
                   optionalAnnuityCodeSelected: String,
                   grandFatheredBenefitEffDate: Date,
                   grandfatheredBenefit: String,
                   frozenBenefitEffDate: Date,
                   frozenBenefit: String,
                   acquiredEffDate: Date,
                   acquired: String
                 )

object Participant {
//  implicit val ParticipantFormat = Json.format[Participant]
}
