package com.indialone.fragment_viewpager_detailed_demo.model

data class MovieEntity(
    var title : String,
    var imdb : String,
    var director : String,
    var poster : Int,
    var actors : ArrayList<ActorEntity>
)
