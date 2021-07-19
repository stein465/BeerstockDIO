package com.stein.beerstock.mapper;
import com.stein.beerstock.dto.BeerDTO;
import com.stein.beerstock.entitiy.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}