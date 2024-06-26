package com.albertojbe.apiroupas.Repository;

import com.albertojbe.apiroupas.Model.Clothe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClotheRepository extends JpaRepository<Clothe, Long> {
}
