interface ApiInterface {
    import retrofit2.Call
    import retrofit2.http.Body
    import retrofit2.http.GET

    interface ApiInterface {
        @GET("https://stats.nba.com/stats/allstarballotpredictor")
        fun getExampleData(): Call<ExampleResponse>
    }
}
