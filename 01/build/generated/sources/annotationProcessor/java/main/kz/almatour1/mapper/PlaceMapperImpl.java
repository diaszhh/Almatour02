package kz.almatour1.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kz.almatour1.dto.PlaceDTO;
import kz.almatour1.model.Category;
import kz.almatour1.model.Place;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-14T17:25:55+0600",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.5.jar, environment: Java 21 (Oracle Corporation)"
)
@Component
public class PlaceMapperImpl implements PlaceMapper {

    @Override
    public Place toEntity(PlaceDTO placeDTO) {
        if ( placeDTO == null ) {
            return null;
        }

        Place place = new Place();

        place.setId( placeDTO.getId() );
        place.setDescription( placeDTO.getDescription() );
        List<Category> list = placeDTO.getCategories();
        if ( list != null ) {
            place.setCategories( new ArrayList<Category>( list ) );
        }
        place.setCity( placeDTO.getCity() );

        return place;
    }

    @Override
    public PlaceDTO toDTO(Place place) {
        if ( place == null ) {
            return null;
        }

        PlaceDTO placeDTO = new PlaceDTO();

        placeDTO.setId( place.getId() );
        placeDTO.setDescription( place.getDescription() );
        List<Category> list = place.getCategories();
        if ( list != null ) {
            placeDTO.setCategories( new ArrayList<Category>( list ) );
        }
        placeDTO.setCity( place.getCity() );

        return placeDTO;
    }

    @Override
    public List<PlaceDTO> toDTOList(List<Place> places) {
        if ( places == null ) {
            return null;
        }

        List<PlaceDTO> list = new ArrayList<PlaceDTO>( places.size() );
        for ( Place place : places ) {
            list.add( toDTO( place ) );
        }

        return list;
    }
}
