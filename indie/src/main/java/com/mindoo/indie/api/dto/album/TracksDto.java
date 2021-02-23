package com.mindoo.indie.api.dto.album;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;


@Data
@NoArgsConstructor
@XmlRootElement(name="major_tracks")
@XmlAccessorType(XmlAccessType.FIELD)
public class TracksDto {
    @XmlElement
    public List<SongDto> song;
}
