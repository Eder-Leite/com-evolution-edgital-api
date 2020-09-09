package com.evolution.repository.tesouraria.carteira;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.evolution.repository.tesouraria.filter.CarteiraFilter;
import com.evolution.repository.tesouraria.projection.CarteiraResumo;

public interface CarteiraRepositoryQuery {

	public Page<CarteiraResumo> resumir(CarteiraFilter filter, Pageable pageable);

}
