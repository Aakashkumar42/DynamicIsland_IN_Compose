package com.akash_dev.dynamicisland.components.notification.media_player

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.akash_dev.dynamicisland.R
import com.akash_dev.dynamicisland.Utils.Constants

@Composable
fun MediaPlayerCollapsed(
    modifier: Modifier=Modifier
){
    Row(
        modifier=modifier.width(Constants.getIslandWeight()/2f),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {

        val imageSize=32.dp

        Image(painterResource(id = R.drawable.media_player_background),"Media Player",
        modifier = Modifier
            .size(imageSize)
            .clip(RoundedCornerShape(6.dp)),
            contentScale = ContentScale.FillBounds
        )
       
        Icon(
            painterResource(id = R.drawable.ic_sound1),
            "Music Sound",
            modifier   = Modifier.size(imageSize),
            tint = Color.Magenta
        )
    }
}

@Preview
@Composable
fun getMediaPlayerCollapsedPreview(){
    MediaPlayerCollapsed()
}
