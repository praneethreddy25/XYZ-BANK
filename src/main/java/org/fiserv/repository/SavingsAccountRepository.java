package org.fiserv.repository;import io.quarkus.hibernate.orm.panache.PanacheRepository;import jakarta.enterprise.context.ApplicationScoped;import org.fiserv.model.SavingsAccount;@ApplicationScopedpublic class SavingsAccountRepository implements PanacheRepository<SavingsAccount>{       public SavingsAccount findByUserId(Long userId){              return find("user.id",userId).firstResult();       }}