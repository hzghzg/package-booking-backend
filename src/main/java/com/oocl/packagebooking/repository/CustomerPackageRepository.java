package com.oocl.packagebooking.repository;

import com.oocl.packagebooking.entity.CustomerPackage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CustomerPackageRepository extends JpaRepository<CustomerPackage,String> {
}
