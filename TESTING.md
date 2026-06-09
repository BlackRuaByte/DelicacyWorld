# Restaurant Craft 测试说明

1. 使用 JDK 17。
2. 执行 `./gradlew build` 或 Windows 下 `./gradlew.bat build`。
3. 执行 `./gradlew.bat runClient`。
4. 创造模式打开 Restaurant Craft 标签页。
5. 放置餐厅经营方块、入口、出口、桌子、椅子。
6. 右键餐厅经营方块，放入菜谱和任意食材，点击开始营业。
7. 客人会从入口生成、寻找椅子、点菜并显示倒计时。
8. 使用设备将对应 raw 菜品烹饪为 cooked 菜品，右键客人交付。
9. 使用 `/restaurantcraft info|close|addpopularity|addmoney|reset|debug area` 测试管理命令。

TODO 扩展集中项：商人交易、战利品表、特殊怪物掉落、更好的模型贴图、客人动画和更复杂评分。
