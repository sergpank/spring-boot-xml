package com.exmaple;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;
import java.util.Random;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@XmlRootElement
public class Contact implements Serializable {
    @XmlElement
    private Long id;
    @XmlElement
    private int version;
    @Getter private String firstName;
    @XmlElement
    private String lastName;
    @XmlElement
    private Date birthDate;

    public static Contact randomContact() {
        Random random = new Random();
        return new Contact(random.nextLong(), random.nextInt(), "name-" + random.nextLong(), "surname-" + random.nextLong(), new Date());
    }
}
