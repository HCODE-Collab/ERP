package com.spring.payroll.erp.repositories;

import com.spring.payroll.erp.models.AuditLog;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for managing {@link AuditLog} entities.
 * <p>
 * Provides basic CRUD operations, as well as pagination and query support,
 * through Spring Data JPA.
 *
 * <p>No additional method definitions are required unless custom queries are needed.
 *
 * @author payroll Backend
 * @see com.spring.payroll.erp.models.AuditLog
 */
public interface AuditLogRepository extends JpaRepository<AuditLog, Long> {
}
