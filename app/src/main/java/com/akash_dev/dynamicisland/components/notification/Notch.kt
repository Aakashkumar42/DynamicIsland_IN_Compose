package com.akash_dev.dynamicisland.components.notification

import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.akash_dev.dynamicisland.Utils.Constants

@Composable
fun Notch(){

    val notchWidth=Constants.getMinIslandWidth()
    val notchHeight=Constants.getMinIslandHeight()

    Card(
        modifier = Modifier
            .width(notchWidth)
            .height(notchHeight),
        backgroundColor = Constants.dynamicIslandBackgroundColor,
        shape = Constants.dynamicIslandBackgroundShape
    ){
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround
        ) {

            FakeCamera()
            NotificationLight()
            FakeCamera()

        }
    }
}

@Preview
@Composable
fun getNotchPreview(){
    Notch()
}