package io.getarrays.server.model;

import io.getarrays.server.enumeration.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity //create a entity for this class that is going to store id DB
@Data // reduce boilerplate for getter,setter , TOSTRING, requiredArgsConstructor
@NoArgsConstructor // generate empty parameter constructor
@AllArgsConstructor //generate constructor for all the field in the class
public class Server {

    @Id //primary key
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true) // column details in table
    @NotEmpty(message = "IP Address cannot be empty or null")
    private String ipAddress;
    private String name;
    private String memory;
    private String type;
    private String imageUrl;
    private Status status;
}
