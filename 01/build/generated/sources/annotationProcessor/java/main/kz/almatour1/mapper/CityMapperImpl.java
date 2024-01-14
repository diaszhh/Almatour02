package kz.almatour1.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import kz.almatour1.dto.CityDTO;
import kz.almatour1.model.City;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-14T17:55:55+0600",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.5.jar, environment: Java 21 (Oracle Corporation)"
)
@Component
public class CityMapperImpl implements CityMapper {

    @Override
    public City toEntity(CityDTO cityDTO) {
        if ( cityDTO == null ) {
            return null;
        }

        City city = new City();

        city.setId( cityDTO.getId() );
        city.setCityName( cityDTO.getCityName() );

        return city;
    }

    @Override
    public CityDTO toDTO(City city) {
        if ( city == null ) {
            return null;
        }

        CityDTO cityDTO = new CityDTO();

        cityDTO.setId( city.getId() );
        cityDTO.setCityName( city.getCityName() );

        return cityDTO;
    }

    @Override
    public List<CityDTO> toDTOList(List<City> cities) {
        if ( cities == null ) {
            return null;
        }

        List<CityDTO> list = new ArrayList<CityDTO>( cities.size() );
        for ( City city : cities ) {
            list.add( toDTO( city ) );
        }

        return list;
    }
}
