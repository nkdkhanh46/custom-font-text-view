# Custom Font Text View
Apply custom font to your TextView / EditText

# Usage
#### Copy fonts to assets/fonts folder

#### Add CustomFontTextView to xml layout

```javascript
    <com.martin.library.CustomFontTextView
            android:id="@+id/tvName"
            ...
            app:fontName="nunito_bold.ttf"
            android:text="Hello World!"/>
```

#### Update font programmatically
```javascript
    tvName.setFont("nunito_italic.ttf")
```

## License
Copyright 2019 Martin Mystery
```
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
