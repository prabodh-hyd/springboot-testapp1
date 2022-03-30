package in.prabodh.entity;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "T_NBFC_MASTER")
public class NbfcMaster {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;
	private String nbfc_name;
	private boolean nbfc_status;
	@CreationTimestamp
	private Date created_At;
	@UpdateTimestamp
	private Time update_At;
	private String disbursmentAccount;
	private String repaymentAccount;
	private String reserved1;
	private String reserved2;
	private String reserved3;
	private String reserved4;

	public NbfcMaster() {
		// default constructor
	}
	
	public NbfcMaster(int id, String nbfc_name, boolean nbfc_status, Date created_At, Time update_At,
			String disbursmentAccount, String repaymentAccount,String reserved1,String reserved2,String reserved3,String reserved4) {
		super();
		this.id = id;
		this.nbfc_name = nbfc_name;
		this.nbfc_status = nbfc_status;
		this.created_At = created_At;
		this.update_At = update_At;
		this.disbursmentAccount = disbursmentAccount;
		this.repaymentAccount = repaymentAccount;
		this.reserved1=reserved1;
		this.reserved2=reserved2;
		this.reserved3=reserved3;
		this.reserved4=reserved4;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNbfc_name() {
		return nbfc_name;
	}

	public void setNbfc_name(String nbfc_name) {
		this.nbfc_name = nbfc_name;
	}

	public boolean isNbfc_status() {
		return nbfc_status;
	}

	public void setNbfc_status(boolean nbfc_status) {
		this.nbfc_status = nbfc_status;
	}

	public Date getCreated_At() {
		return created_At;
	}

	public void setCreated_At(Date created_At) {
		this.created_At = created_At;
	}

	public Time getUpdate_At() {
		return update_At;
	}

	public void setUpdate_At(Time update_At) {
		this.update_At = update_At;
	}

	public String getDisbursmentAccount() {
		return disbursmentAccount;
	}

	public void setDisbursmentAccount(String disbursmentAccount) {
		this.disbursmentAccount = disbursmentAccount;
	}

	public String getRepaymentAccount() {
		return repaymentAccount;
	}

	public void setRepaymentAccount(String repaymentAccount) {
		this.repaymentAccount = repaymentAccount;
	}
	public String getReserved1() {
		return reserved1;
	}

	public void setReserved1(String reserved1) {
		this.reserved1 = reserved1;
	}

	public String getReserved2() {
		return reserved2;
	}

	public void setReserved2(String reserved2) {
		this.reserved2 = reserved2;
	}

	public String getReserved3() {
		return reserved3;
	}

	public void setReserved3(String reserved3) {
		this.reserved3 = reserved3;
	}

	public String getReserved4() {
		return reserved4;
	}

	public void setReserved4(String reserved4) {
		this.reserved4 = reserved4;
	}

	@Override
	public String toString() {
		return "Master [id=" + id + ", nbfc_name=" + nbfc_name + ", nbfc_status=" + nbfc_status + ", created_At="
				+ created_At + ", update_At=" + update_At + ", disbursmentAccount=" + disbursmentAccount
				+ ", repaymentAccount=" + repaymentAccount + ", reserved1=" +reserved1 + ",reserved2=" + reserved2 +", reserved3=" + reserved3 +",reserved4=" +reserved4 +"]";
	}

}
