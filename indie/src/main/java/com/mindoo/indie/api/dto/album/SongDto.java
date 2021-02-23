package com.mindoo.indie.api.dto.album;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@NoArgsConstructor
@XmlRootElement(name="song")
@XmlAccessorType(XmlAccessType.FIELD)
public class SongDto {
    @XmlElement
    public int id;

    @XmlElement
    public String name;

}
