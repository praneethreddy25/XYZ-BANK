package org.fiserv.model;import jakarta.persistence.*;import lombok.Getter;import lombok.Setter;import java.util.List;@Entity@Getter@Setter@Table(name="savings_account")public class SavingsAccount {       @Id       @GeneratedValue       @Column(name="account_id")       private Long accountId;       @Column(name="account_number")       private String accountNumber;       @Column(nullable = false)       private Long balance;       @OneToOne       @JoinColumn(name="user_id")       private User user;       @OneToMany(mappedBy = "account")       List<Transaction> transactions;}