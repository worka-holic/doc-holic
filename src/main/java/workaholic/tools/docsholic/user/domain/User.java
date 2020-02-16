package workaholic.tools.docsholic.user.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import lombok.Getter;
import lombok.Setter;
import workaholic.tools.docsholic.base.domain.BaseEntity;

@Getter
@Setter
@Entity
public class User extends BaseEntity {
	@Column
	private String email;
	@Column
	private String name;
	@Enumerated(EnumType.STRING)
	private AccountType accountType;
	@Column
	private String password;
}
