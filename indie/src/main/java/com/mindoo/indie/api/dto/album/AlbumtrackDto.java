package com.mindoo.indie.api.dto.album;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@NoArgsConstructor
@XmlRootElement(name="albumtrack")
@XmlAccessorType(XmlAccessType.FIELD)
public class AlbumtrackDto {
    @XmlElement
    public int track_count;

    @XmlElement
    public String tracklist;

    @XmlElement
    public TracksDto major_tracks;

}
