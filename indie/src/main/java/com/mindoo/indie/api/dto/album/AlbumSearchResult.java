package com.mindoo.indie.api.dto.album;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.*;
import java.util.List;

@Data
@NoArgsConstructor
@XmlRootElement(name = "channel")
@XmlAccessorType(XmlAccessType.FIELD)
public class AlbumSearchResult {
    @XmlElement
    public int total;

    @XmlElement(name="item")
    public List<AlbumDto> albumDto;

}
