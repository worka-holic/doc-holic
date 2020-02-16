package workaholic.tools.docsholic.group.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;
import workaholic.tools.docsholic.base.domain.BaseEntity;
import workaholic.tools.docsholic.user.domain.User;

@Entity
@Getter
@Setter
public class Group extends BaseEntity {
	@Column
	private String name;
	@OneToMany
	@JoinTable(name = "group_user",
			joinColumns = @JoinColumn(name = "group_id"),
			inverseJoinColumns = @JoinColumn(name = "user_id"))
	private List<User> users;
}
