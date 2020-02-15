package workaholic.tools.docsholic.user.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class UserGroup {
	@OneToMany
	private Set<User> users;
}
