package com.nativeQuery.Repository;

import com.nativeQuery.Model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyRepository extends JpaRepository<Company,Integer> {
   public List<Company> findByCompanyName(String name);

    List<Company> findByCompanyNameAndEmail(String name,String email);
    @Query(value="select * from companys ",nativeQuery = true)
    public List<Company> getCompanyDeatils();
    @Query(value = "select * from companys where company_id=:n",nativeQuery = true)
    public List<Company> getCompanyById(@Param("n") Integer id);


}
