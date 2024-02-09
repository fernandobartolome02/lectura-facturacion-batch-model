package net.eviden.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-31T16:14:18+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 20.0.1 (Oracle Corporation)"
)
@Component
public class ValidacioLecturaMapperImpl implements ValidacioLecturaMapper {

    @Override
    public ValidacioLectura modelToEntity(ValidacioLecturaDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ValidacioLectura validacioLectura = new ValidacioLectura();

        if ( dto.getPolissaSubm() != null ) {
            validacioLectura.setPolissaSubm( trim( dto.getPolissaSubm() ) );
        }
        if ( dto.getNumComplet() != null ) {
            validacioLectura.setNumComplet( trim( dto.getNumComplet() ) );
        }
        if ( dto.getTsValidacio() != null ) {
            validacioLectura.setTsValidacio( dto.getTsValidacio() );
        }
        if ( dto.getDataLectura() != null ) {
            validacioLectura.setDataLectura( dto.getDataLectura() );
        }
        if ( dto.getHoraLectura() != null ) {
            validacioLectura.setHoraLectura( trim( dto.getHoraLectura() ) );
        }
        if ( dto.getLecturaComp() != null ) {
            validacioLectura.setLecturaComp( dto.getLecturaComp() );
        }
        if ( dto.getFiabilitat() != null ) {
            validacioLectura.setFiabilitat( trim( dto.getFiabilitat() ) );
        }
        if ( dto.getOrigLectura() != null ) {
            validacioLectura.setOrigLectura( trim( dto.getOrigLectura() ) );
        }
        if ( dto.getTipValidLect() != null ) {
            validacioLectura.setTipValidLect( trim( dto.getTipValidLect() ) );
        }
        if ( dto.getDataMinValid() != null ) {
            validacioLectura.setDataMinValid( dto.getDataMinValid() );
        }
        if ( dto.getValidLect() != null ) {
            validacioLectura.setValidLect( trim( dto.getValidLect() ) );
        }
        if ( dto.getParamX() != null ) {
            validacioLectura.setParamX( dto.getParamX() );
        }
        if ( dto.getParamD() != null ) {
            validacioLectura.setParamD( dto.getParamD() );
        }
        if ( dto.getParamP() != null ) {
            validacioLectura.setParamP( dto.getParamP() );
        }
        if ( dto.getParamK() != null ) {
            validacioLectura.setParamK( dto.getParamK() );
        }
        if ( dto.getLecturaAnt() != null ) {
            validacioLectura.setLecturaAnt( dto.getLecturaAnt() );
        }
        if ( dto.getLecturaPos() != null ) {
            validacioLectura.setLecturaPos( dto.getLecturaPos() );
        }
        if ( dto.getConsumMigDia() != null ) {
            validacioLectura.setConsumMigDia( dto.getConsumMigDia() );
        }
        if ( dto.getDiesEntreLect() != null ) {
            validacioLectura.setDiesEntreLect( dto.getDiesEntreLect() );
        }
        if ( dto.getCodiComanda() != null ) {
            validacioLectura.setCodiComanda( dto.getCodiComanda() );
        }
        if ( dto.getTipusOpe() != null ) {
            validacioLectura.setTipusOpe( trim( dto.getTipusOpe() ) );
        }
        if ( dto.getCodiOpe() != null ) {
            validacioLectura.setCodiOpe( trim( dto.getCodiOpe() ) );
        }
        if ( dto.getInciLectComp() != null ) {
            validacioLectura.setInciLectComp( trim( dto.getInciLectComp() ) );
        }
        if ( dto.getIdLotLect() != null ) {
            validacioLectura.setIdLotLect( trim( dto.getIdLotLect() ) );
        }

        return validacioLectura;
    }

    @Override
    public List<ValidacioLecturaDTO> listEntityToDto(List<ValidacioLectura> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ValidacioLecturaDTO> list = new ArrayList<ValidacioLecturaDTO>( entities.size() );
        for ( ValidacioLectura validacioLectura : entities ) {
            list.add( entityToDTO( validacioLectura ) );
        }

        return list;
    }

    @Override
    public List<ValidacioLectura> listDtoToEntity(List<ValidacioLecturaDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<ValidacioLectura> list = new ArrayList<ValidacioLectura>( dtos.size() );
        for ( ValidacioLecturaDTO validacioLecturaDTO : dtos ) {
            list.add( modelToEntity( validacioLecturaDTO ) );
        }

        return list;
    }

    @Override
    public ValidacioLecturaDTO entityToDTO(ValidacioLectura entity) {
        if ( entity == null ) {
            return null;
        }

        ValidacioLecturaDTO validacioLecturaDTO = new ValidacioLecturaDTO();

        if ( entity.getNumComplet() != null ) {
            validacioLecturaDTO.setNumComplet( trim( entity.getNumComplet() ) );
        }
        if ( entity.getTsValidacio() != null ) {
            validacioLecturaDTO.setTsValidacio( entity.getTsValidacio() );
        }
        if ( entity.getDataLectura() != null ) {
            validacioLecturaDTO.setDataLectura( entity.getDataLectura() );
        }
        if ( entity.getHoraLectura() != null ) {
            validacioLecturaDTO.setHoraLectura( trim( entity.getHoraLectura() ) );
        }
        if ( entity.getLecturaComp() != null ) {
            validacioLecturaDTO.setLecturaComp( entity.getLecturaComp() );
        }
        if ( entity.getFiabilitat() != null ) {
            validacioLecturaDTO.setFiabilitat( trim( entity.getFiabilitat() ) );
        }
        if ( entity.getOrigLectura() != null ) {
            validacioLecturaDTO.setOrigLectura( trim( entity.getOrigLectura() ) );
        }
        if ( entity.getTipValidLect() != null ) {
            validacioLecturaDTO.setTipValidLect( trim( entity.getTipValidLect() ) );
        }
        if ( entity.getDataMinValid() != null ) {
            validacioLecturaDTO.setDataMinValid( entity.getDataMinValid() );
        }
        if ( entity.getValidLect() != null ) {
            validacioLecturaDTO.setValidLect( trim( entity.getValidLect() ) );
        }
        if ( entity.getParamX() != null ) {
            validacioLecturaDTO.setParamX( entity.getParamX() );
        }
        if ( entity.getParamD() != null ) {
            validacioLecturaDTO.setParamD( entity.getParamD() );
        }
        if ( entity.getParamP() != null ) {
            validacioLecturaDTO.setParamP( entity.getParamP() );
        }
        if ( entity.getParamK() != null ) {
            validacioLecturaDTO.setParamK( entity.getParamK() );
        }
        if ( entity.getLecturaAnt() != null ) {
            validacioLecturaDTO.setLecturaAnt( entity.getLecturaAnt() );
        }
        if ( entity.getLecturaPos() != null ) {
            validacioLecturaDTO.setLecturaPos( entity.getLecturaPos() );
        }
        if ( entity.getConsumMigDia() != null ) {
            validacioLecturaDTO.setConsumMigDia( entity.getConsumMigDia() );
        }
        if ( entity.getDiesEntreLect() != null ) {
            validacioLecturaDTO.setDiesEntreLect( entity.getDiesEntreLect() );
        }
        if ( entity.getCodiComanda() != null ) {
            validacioLecturaDTO.setCodiComanda( entity.getCodiComanda() );
        }
        if ( entity.getTipusOpe() != null ) {
            validacioLecturaDTO.setTipusOpe( trim( entity.getTipusOpe() ) );
        }
        if ( entity.getCodiOpe() != null ) {
            validacioLecturaDTO.setCodiOpe( trim( entity.getCodiOpe() ) );
        }
        if ( entity.getInciLectComp() != null ) {
            validacioLecturaDTO.setInciLectComp( trim( entity.getInciLectComp() ) );
        }
        if ( entity.getIdLotLect() != null ) {
            validacioLecturaDTO.setIdLotLect( trim( entity.getIdLotLect() ) );
        }

        validacioLecturaDTO.setPolissaSubm( trim(entity.getPolissaSubm()) );

        return validacioLecturaDTO;
    }
}
