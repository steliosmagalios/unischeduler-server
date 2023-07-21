package me.steliosmagalios.prologserver.models

import me.steliosmagalios.prologserver.utils.RoomType

class Room(val id: Int, val type: RoomType, val capacity: Int, val availability: List<Int>)