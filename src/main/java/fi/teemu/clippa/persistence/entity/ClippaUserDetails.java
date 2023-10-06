package fi.teemu.clippa.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "user_details")
public class ClippaUserDetails {

	@Id
	private Long id;

	@Column(name = "email", unique = true, nullable = false)
	private String email;

	@Column(name = "username", unique = true)
	private String username;
}
