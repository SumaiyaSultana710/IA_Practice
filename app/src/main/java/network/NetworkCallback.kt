package network

import model.Post

interface NetworkCallback {
    fun getList(postList: List<Post>)
}