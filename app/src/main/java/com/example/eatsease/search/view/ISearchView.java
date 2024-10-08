package com.example.eatsease.search.view;

import com.example.eatsease.model.network.response.AreaResponse;
import com.example.eatsease.model.network.response.CategoriesResponse;
import com.example.eatsease.model.network.response.Ingredientt;
import com.example.eatsease.model.network.response.MealsResponse;

import java.util.List;

public interface ISearchView {
    void onFetchCategoriesSuccess(CategoriesResponse categoriesResponse);
    void onFetchCategoriesError(Throwable throwable);
    void onFetchAreasSuccess(List<AreaResponse.Area> areas);  // Correct method signature
    void onFetchAreasError(Throwable throwable);

    void onIngredientsFetched(List<Ingredientt> ingredients);
    void onFetchIngredientsError(String message);

    void onMealsSuccess(MealsResponse mealsResponse);
    void onFetchMealsError(Throwable throwable);

    void onAreaMealsSuccess (MealsResponse mealsResponse);
    void onFetchAreaMealsError(Throwable throwable);

    void onIngredientsMealsFetched(MealsResponse mealsResponse);
    void onFetchIngredientsMealsError(Throwable throwable);
}
