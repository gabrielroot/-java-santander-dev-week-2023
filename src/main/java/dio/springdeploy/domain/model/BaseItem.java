package dio.springdeploy.domain.model;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class BaseItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String icon;

    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
}
