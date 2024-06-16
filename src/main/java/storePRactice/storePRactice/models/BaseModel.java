package storePRactice.storePRactice.models;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.CurrentTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@MappedSuperclass
public abstract class BaseModel {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private UUID id;
@CreationTimestamp
private Instant createdAt;
@UpdateTimestamp
private Instant updatedAt;
@Column(nullable = false, updatable = false)
@org.hibernate.annotations.CreationTimestamp
private LocalDateTime time;
}
