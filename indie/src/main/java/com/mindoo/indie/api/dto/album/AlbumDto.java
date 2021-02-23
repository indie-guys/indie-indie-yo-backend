package com.mindoo.indie.api.dto.album;

import lombok.Data;
import lombok.NoArgsConstructor;


import javax.xml.bind.annotation.*;
import java.util.Date;


@Data
@NoArgsConstructor
@XmlRootElement(name="item")
@XmlAccessorType(XmlAccessType.FIELD)
public class AlbumDto {
    @XmlElement
    public String title;

    @XmlElement
    public String release;

    @XmlElement(name="albumtrack", namespace = "http://www.maniadb.com/api")
    public AlbumtrackDto albumTrack;

    @XmlElement(name="thumnail")
    public String thumbnail;

    @XmlElement
    public String image;

    @XmlElement(name="albumartists", namespace = "http://www.maniadb.com/api")
    public String albumArtists;

    @XmlAttribute(name="id")
    public int id;


}
