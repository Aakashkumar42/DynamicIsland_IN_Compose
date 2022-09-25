package com.akash_dev.dynamicisland.Utils

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

object Constants{

    val dynamicIslandBackgroundShape    =   RoundedCornerShape(64.dp)
    val dynamicIslandBackgroundColor    =   Color.Black

    @Composable
    fun getMinIslandWidth():Dp{
        val configuration= LocalConfiguration.current
        return (configuration.screenWidthDp /2.5f).dp
    }

    @Composable
    fun getMinIslandHeight():Dp{
        val configuration= LocalConfiguration.current
        return (configuration.screenHeightDp /18f).dp
    }
    @Composable
    fun getIslandHeight():Dp{
        val configuration= LocalConfiguration.current
        return configuration.screenHeightDp.dp
    }
    @Composable
    fun getIslandWeight():Dp{
        val configuration= LocalConfiguration.current
        return configuration.screenWidthDp.dp
    }
}