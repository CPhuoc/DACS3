package com.nabilbdev.fes.data

import com.nabilbdev.fes.R
import com.nabilbdev.fes.data.model.CategoryOptions
import com.nabilbdev.fes.data.model.Recommendation
import com.nabilbdev.fes.ui.utils.FesPlacesReview

object DataSourceProvider {

    val defaultRecommendation: Recommendation = Recommendation(
        name = "",
        description = "",
        review = FesPlacesReview.NONE,
        categoryOptions = CategoryOptions.LANDMARKS,
        imageResourceId = R.drawable.land1
    )

    val allRecommendations = listOf(
        Recommendation(
            name = "Bà Nà Hills",
            description = "Đà Nẵng với danh xưng thành phố đáng sống nhất Việt Nam ắt hẳn là có lý do của nó. Nằm ở trung tâm khu vực duyên hải miền Trung, Đà Nẵng đã, đang và sẽ luôn là điểm hết hàng đầu của du khách trong những chuyến du lịch Việt Nam.",
            review = FesPlacesReview.FIVE,
            categoryOptions = CategoryOptions.LANDMARKS,
            imageResourceId = R.drawable.land1
        ),

        Recommendation(
            name = "Fansipan",
            description = "Tại sao du lịch Việt Nam lại không nên bỏ qua Sapa? Đơn giản bởi nếu ghé Sapa, nó sẽ đưa bạn hòa mình vào  giữa những thửa ruộng bậc thang chín vàng rực rỡ, trải dài bất tận như dải lụa óng ánh mềm mại quấn quanh sườn núi. Đó là khoảnh khắc đẹp nhất của Sapa khi mùa lúa chín nhuộm vàng mọi ngõ ngách, biến nơi đây thành một bức tranh thiên nhiên kỳ vĩ.",
            review = FesPlacesReview.FOUR,
            categoryOptions = CategoryOptions.LANDMARKS,
            imageResourceId = R.drawable.land2
        ),

        Recommendation(
            name = "Thác Bản Giốc",
            description = "Đến thác Bản Giốc, bạn sẽ bị choáng ngợp bởi vẻ đẹp hoang sơ và âm thanh rì rào của nước chảy.",
            review = FesPlacesReview.THREE,
            categoryOptions = CategoryOptions.LANDMARKS,
            imageResourceId = R.drawable.land3
        ),

        Recommendation(
            name = "Quốc Tử Giám",
            description = " Hà Nội là cầu Thê Húc màu đỏ rực, là Lăng Bác thiêng liêng, là Quốc Tử Giám xuất hiện trên những trang sách.",
            review = FesPlacesReview.FIVE,
            categoryOptions = CategoryOptions.LANDMARKS,
            imageResourceId = R.drawable.land4
        ),

        Recommendation(
            name = "Hội An",
            description = "Phố cổ Hội An luôn khiến lòng người mê mẩn trong chuyến du lịch Việt Nam bởi nét đẹp dung dị mà không kém phần quyến rũ như một bức tranh thời gian ngưng đọng. Vẻ cổ kính hòa quyện với sự thơ mộng nơi đây đã biến Hội An trở thành một trong những phố cổ đẹp nhất châu Á.",
            review = FesPlacesReview.FOUR,
            categoryOptions = CategoryOptions.LANDMARKS,
            imageResourceId = R.drawable.land5
        ),

        Recommendation(
            name = "Cố đô Huế",
            description = "Cố đô Huế là một trong những điểm đến nổi bật trong hành trình du lịch Việt Nam. Nổi tiếng với những công trình kiến trúc lịch sử như Đại Nội hay lăng tẩm của các vua Nguyễn, Huế mang đến cho du khách những trải nghiệm độc đáo về văn hóa và lịch sử.",
            review = FesPlacesReview.THREE,
            categoryOptions = CategoryOptions.LANDMARKS,
            imageResourceId = R.drawable.land6
        ),

        Recommendation(
            name = "Nhà Hàng Veranda Vietnamese",
            description = "Đến với nhà hàng Veranda Vietnamese, thực khách sẽ được thưởng ngoạn vẻ đẹp và hương vị tinh tế của ẩm thực Việt 3 miền do chính bếp trưởng Luis Thạch tuyển chọn và chế tác tỉ mỉ.",
            review = FesPlacesReview.FOUR,
            categoryOptions = CategoryOptions.RESTAURANTS,
            imageResourceId = R.drawable.restaurant1
        ),

        Recommendation(
            name = "Steak & Seafood Buffet - Furama Resort Da Nang",
            description = "Furama Resort Da Nang cũng là một cái tên chuyên về buffet hải sản được cả người dân địa phương lẫn du khách thập phương yêu thích.",
            review = FesPlacesReview.THREE,
            categoryOptions = CategoryOptions.RESTAURANTS,
            imageResourceId = R.drawable.restaurant2
        ),

        Recommendation(
            name = "Golden Dragon Restaurant",
            description = "Khách sạn Grand Mercure không chỉ đem tới dịch vụ lưu trú nghỉ dưỡng cao cấp, mà nơi này còn có đa dạng nhà hàng phục vụ tinh hoa ẩm thực trong và ngoài nước cho bạn tha hồ lựa chọn.",
            review = FesPlacesReview.ONE,
            categoryOptions = CategoryOptions.RESTAURANTS,
            imageResourceId = R.drawable.restaurant3
        ),
        Recommendation(
            name = "Nhà Hàng All Seasons",
            description = "Nhà hàng All Seasons là một cái tên “must-try” mà bạn nhất định phải ghé đến khi đến với thành phố Đà Nẵng.",
            review = FesPlacesReview.FOUR,
            categoryOptions = CategoryOptions.RESTAURANTS,
            imageResourceId = R.drawable.restaurant4
        ),

        Recommendation(
            name = "Nhà Hàng The Temptation",
            description = "Nhà hàng Pháp tiếp theo tại Đà Nẵng mà #teamKlook không nên bỏ qua là nhà hàng The Temptation, khi mỗi món ăn là sự thăng hoa của thị giác và cảm xúc về nước Pháp thơ mộng.",
            review = FesPlacesReview.THREE,
            categoryOptions = CategoryOptions.RESTAURANTS,
            imageResourceId = R.drawable.restaurant5
        ),

        Recommendation(
            name = "Nhà Hàng Nêm",
            description = "Nhà hàng Nêm là điểm đến lý tưởng và quen thuộc cho nhiều tín đồ muốn được thưởng thức ẩm thực Việt Nam truyền thống.",
            review = FesPlacesReview.ONE,
            categoryOptions = CategoryOptions.RESTAURANTS,
            imageResourceId = R.drawable.restaurant6
        ),

        Recommendation(
            name = "MARRIOT",
            description = "Danang Marriott Resort & Spa sở hữu kiến trúc Indochine đậm chất Á Đông và mang trong mình hơi thở thiên nhiên hoang sơ. Chính sự kết hợp độc đáo này đã giúp Danang Marriott Resort & Spa được vinh danh là “Khu nghỉ dưỡng biển hàng đầu Việt Nam” bởi World Travel Award vào năm 2017.",
            review = FesPlacesReview.THREE,
            categoryOptions = CategoryOptions.HOTELS,
            imageResourceId = R.drawable.hotel1
        ),

        Recommendation(
            name = "Dar Bouanania",
            description = "Riad-style, wonderfully decorated rooms, nice roof-terrace, wifi and very welcoming staff. double Dh 250-400.",
            review = FesPlacesReview.TWO,
            categoryOptions = CategoryOptions.HOTELS,
            imageResourceId = R.drawable.hotel2
        ),

        Recommendation(
            name = "Riad Jamai",
            description = "A traditional riad that has been restored to its former slendour, with extremely helpful and welcoming staff. The rooms are large and comfortable and the breakfast will keep you going all day.",
            review = FesPlacesReview.FOUR,
            categoryOptions = CategoryOptions.HOTELS,
            imageResourceId = R.drawable.hotel3
        ),
        Recommendation(
            name = "MARRIOT",
            description = "Danang Marriott Resort & Spa sở hữu kiến trúc Indochine đậm chất Á Đông và mang trong mình hơi thở thiên nhiên hoang sơ. Chính sự kết hợp độc đáo này đã giúp Danang Marriott Resort & Spa được vinh danh là “Khu nghỉ dưỡng biển hàng đầu Việt Nam” bởi World Travel Award vào năm 2017..",
            review = FesPlacesReview.THREE,
            categoryOptions = CategoryOptions.HOTELS,
            imageResourceId = R.drawable.hotel1
        ),

        Recommendation(
            name = "Dar Bouanania",
            description = "Riad-style, wonderfully decorated rooms, nice roof-terrace, wifi and very welcoming staff. double Dh 250-400.",
            review = FesPlacesReview.TWO,
            categoryOptions = CategoryOptions.HOTELS,
            imageResourceId = R.drawable.hotel2
        ),

        Recommendation(
            name = "Riad Jamai",
            description = "A traditional riad that has been restored to its former slendour, with extremely helpful and welcoming staff. The rooms are large and comfortable and the breakfast will keep you going all day.",
            review = FesPlacesReview.FOUR,
            categoryOptions = CategoryOptions.HOTELS,
            imageResourceId = R.drawable.hotel3
        )
    )
}