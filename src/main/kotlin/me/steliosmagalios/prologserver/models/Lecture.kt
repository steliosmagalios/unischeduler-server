package me.steliosmagalios.prologserver.models

import me.steliosmagalios.prologserver.utils.RoomType

class Lecture(val id: Int, val duration: Int, val type: RoomType, val groups: List<Int>, val professors: List<Int>)

