const path = require('path');

module.exports = {
    entry: './src/main/js/app.js',
    output: {
        path: __dirname + './src/main/resources/static/built/',
        filename: 'app.bundle.js'
    },
    module: {
        rules: [
            {
                test: /\.js$/,
                exclude: [/node_modules/],
                use: {
                    loader: 'babel-loader',
                    options: {
                        presets: ['react', 'env']
                    }
                }
            }
        ]}
}