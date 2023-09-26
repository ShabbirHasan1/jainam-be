package in.codifi.alerts.repository;

import java.sql.Timestamp;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import in.codifi.alerts.entity.primary.AlertsEntity;

public interface AlertsRepository extends JpaRepository<AlertsEntity, Long> {

	/**
	 * method to get Alert Details
	 *
	 * @author SOWMIYA
	 * @return
	 */
	@Transactional
	@Query(value = " SELECT a FROM TBL_ALERT_DETAILS a WHERE a.id = :id and a.activeStatus = 1 ")
	AlertsEntity getTriggerIdDetails(@Param("id") long triggerId);

	/**
	 * method to update Trigger Status
	 *
	 * @author SOWMIYA
	 * @return
	 */
	@Transactional
	@Modifying
	@Query(value = " update TBL_ALERT_DETAILS set TRIGGER_STATUS = 1, TRIGGERED_TIME = :triggeredTime  where ID = :id ")
	void updateTriggerStatus(@Param("id") long triggerId, @Param("triggeredTime") Timestamp triggerTimestamp);

}
